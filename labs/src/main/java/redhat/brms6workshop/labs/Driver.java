package redhat.brms6workshop.labs;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(26ca8c104ab4b43c83541a1794034969)
 */
@org.kie.api.definition.type.Label(value = "Driver Info")
public class Driver extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Driver Age")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer age;
    
    @org.kie.api.definition.type.Label(value = "City")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String city;
    
    @org.kie.api.definition.type.Label(value = "Driver Name")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String name;

    public Driver() {
    }

    public Driver(java.lang.Integer age, java.lang.String city, java.lang.String name) {
        this.age = age;
        this.city = city;
        this.name = name;
    }


    
    public java.lang.Integer getAge() {
        return this.age;
    }

    public void setAge(java.lang.Integer age) {
        this.age = age;
    }
    
    public java.lang.String getCity() {
        return this.city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}