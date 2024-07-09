package FileStream;

import java.io.*;

public class FileStreamDemo {
    private static final long serialVersionUID = 123456765432L;

    public void writeDate() throws IOException {
        File file = new File("C://Users//RAIKAR//IdeaProjects//Stream//demofile.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Student student = new Student(1, "megha", 89);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
    }

    public void readData() throws IOException, ClassNotFoundException {
        File file = new File("C://Users//RAIKAR//IdeaProjects//Stream//demofile.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileStreamDemo fileStreamDemo = new FileStreamDemo();
//fileStreamDemo.writeDate();
        fileStreamDemo.readData();
    }
}
