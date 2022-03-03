package model;

public class Pessoa {

    private String name;
    private String age;
    private String cpf;

    public Pessoa() {

    }

    public Pessoa(String name, String age, String cpf) {
        this.setName(name);
        this.setAge(age);
        this.setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + "nome:" + name + ", idade:" + age + ", cpf:" + cpf + "}";
    }
}
