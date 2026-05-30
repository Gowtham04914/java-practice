package ThirtMay;
class Student {
    int id;
    String name;
    Student(){
        System.out.println("Default constructor called");

    }
    Student(int id ){
        this.id = id;
        System.out.println("id constructor called");
        System.out.println("id="+id);

    }
    Student(int id , String name){
        this.id = id;
        this.name = name;
        System.out.println("ID&Name consructor is called");
        System.out.println("id=" +id);
        System.out.println("Name="+name);
    }


}
