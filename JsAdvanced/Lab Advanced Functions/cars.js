function cars(cmnds){
    const objects = {};

    const getProperties = (obj = {}) => {
        const output = [];
        for (const prop in obj) {
            output.push(`${prop}:${obj[prop]}`);
        }

        return output.join(', ');
    };

    const commands = {
        create: (name1, inherit, name2) => (objects[name1] = Object.create(inherit ? objects[name2] : {})),
        set: (name, prop, val) => (objects[name][prop] = val),
        print: (name) => console.log(getProperties(objects[name])),
    };

    cmnds.map((cmd) => cmd.split(' ')).forEach(([cmd, ...args]) => commands[cmd](...args));
};
cars(['create c1',
    'create c2 inherit c1',
    'set c1 color red',
    'set c2 model new',
    'print c1',
    'print c2']
);