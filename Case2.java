Public class Case2 {
    Public static void main(String[] args) throws Exception {
        System.out.println("NumberPaterns");
        for (int i =1; i<=3; i++) {
            int num=i;
            for (int j=1; j<=7; j++) {
                System.out.print(num+ " ");
                num+=2;
            }
            System.out.println();
        }
    }
}