class TutorialTest {
    public static void main(String[] args) {
		Tutorial t1 = new Tutorial();
        t1.setId(1);
        t1.setSubject("core java");
        t1.setPublished(true);
		Tutorial t2 = new Tutorial();
        t2.setId(2);
        t2.setSubject("ReactJS");
        t2.setPublished(true);
		System.out.println("Tutorial 1 Details:");
        System.out.println("ID: " + t1.getId());
        System.out.println("Subject: " + t1.getSubject());
        System.out.println("Published: " + t1.isPublished());
		System.out.println("\nTutorial 2 Details:");
        System.out.println("ID: " + t2.getId());
        System.out.println("Subject: " + t2.getSubject());
        System.out.println("Published: " + t2.isPublished());
    }
}
