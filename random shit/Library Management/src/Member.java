 class Member extends Item {
    private int memberId;

    public Member(String name, int memberId){
        super(name);
        this.memberId = memberId;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Member ID: " + memberId);
    }
}
