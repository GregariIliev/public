function validate(request){
    if (!['GET', 'POST', 'DELETE', 'CONNECT'].includes(request.method)){
        throw new Error('Invalid request header: Invalid Method');
    }
    if (!/^[a-zA-Z\s+0-9\\.]+$|\*/gm.test(request.uri) || !'*' || !request.uri){
       throw new Error('Invalid request header: Invalid URI');
    }
    if (!['HTTP/0.9', 'HTTP/1.0', 'HTTP/1.1', 'HTTP/2.0'].includes(request.version)){
        throw new Error('Invalid request header: Invalid Version');
    }
    if (/[<>&\\'"]/gm.test(request.message) || request.message === undefined){
        throw new Error('Invalid request header: Invalid Message');
    }
    return request;
}
let httpRequest = {
    method: 'GET',
    uri: 'svn.public.catalog',
    version: 'HTTP/1.1',
    message: ''
}