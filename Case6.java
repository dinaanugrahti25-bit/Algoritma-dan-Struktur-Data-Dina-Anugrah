Public class Case6 {
    Public static void main(String[] args) throws Exception {
        System.out.println("Case6");
        int[] arr = new int [10];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for (int i=3; i<10; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        for (int i=0; i<10; i++) {
            System.out.print();
        }
        }
    }