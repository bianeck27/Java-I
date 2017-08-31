class TresNMaisUm{
    public static void main(String[] args) {
        int x = 13;

        do {
            System.out.print(x+" > ");
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
                        
        } while (x!=1);
            System.out.println(x);
        
        
    }
}