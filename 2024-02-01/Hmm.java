class Hmm {
    public static int mystery(int n) {
        if (n==1) {
            return 2;
        } else {
            return 7 + mystery(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(mystery(3));
    }
}