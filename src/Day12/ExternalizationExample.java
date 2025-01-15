package Day12;

import java.io.*;
class Employee implements Externalizable {
    private String name;
    private int id;
    public Employee() {

    }
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        id = in.readInt();
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + '}';
    }
}

public class ExternalizationExample {
    public static void main(String[] args) {
        String fileName = "employee.ser";

        Employee employee = new Employee("A Imran", 101);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employee);
            System.out.println("Object serialized to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Object deserialized: " + deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
    }
}

