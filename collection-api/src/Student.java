class Student {
    private String name;
    private String usn;
    private int age;

    public Student(String name, String usn, int age) {
        this.name = name;
        this.usn = usn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getUsn() {
        return usn;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + usn + " " + age;
    }
}