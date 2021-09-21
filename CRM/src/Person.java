public class Person implements Cloneable {

    private String name;
    private String surName;
    private String email;
    private String tel;

    public Person() {

    }

    public Person(String name, String surName, String email, String tel) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
