final class interview{
    private final int age ;
    public int getAge(){
        return age;
    }

    public interview(int age1){
        this.age = age1;
        System.out.println(age1);

    }

    public static void main(String[] args) {
        interview j = new interview(20);
		j.age=200;
        System.out.println(j.age);
    }
}