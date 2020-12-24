package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;
    private List<Parents> parentsList;
    private List<Children> childrenList;
    private List<Pokemon> pokemonList;


    public Person(Company company) {
        this.company = company;

    }


    public Person(Car car) {
        this.car = car;
    }

    public Person(Parents parents) {
        this.parentsList = new ArrayList<>();
    }

    public Person(Children children) {
        this.parentsList = new ArrayList<>();
    }

    public Person(Pokemon pokemon) {
        this.parentsList = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parents> getParentsList() {
        return this.parentsList;
    }

    public List<Children> getChildrenList() {
        return this.childrenList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void addParent(Parents parents) {
        this.parentsList.add(parents);
    }

    public void addChildren(Children children) {
        this.childrenList.add(children);
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public void setPokemonList() {
        this.pokemonList = new ArrayList<>();
    }

    public void setParentsList() {
        this.parentsList = new ArrayList<>();
    }

    public void setChildrenList() {
        this.childrenList = new ArrayList<>();
    }





    public void companyPrint() {
        System.out.println("Company:");
        if (this.company != null){
            System.out.println(this.company);
        }
    }

    public void carPrint() {
        System.out.println("Car:");
        if (this.car != null){
            System.out.println(this.car);
        }
    }

    public void pokemonPrint() {
        System.out.println("Pokemon:");
        if (this.pokemonList != null){
            for (int i = 0; i < this.pokemonList.size(); i++) {
                System.out.println(this.pokemonList.get(i).toString());
            }
        }
    }

    public void parentsPrint() {
        System.out.println("Parents:");
        if (this.parentsList != null){
            for (int i = 0; i < this.parentsList.size(); i++) {
                System.out.println(this.parentsList.get(i).toString());
            }
        }
    }

    public void childrenPrint() {
        System.out.println("Children:");
        if (this.childrenList != null){
            for (int i = 0; i < this.childrenList.size(); i++) {
                System.out.println(this.childrenList.get(i).toString());
            }
        }
    }
}