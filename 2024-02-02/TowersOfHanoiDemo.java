class TowersOfHanoiDemo {
    public static void move(int count, int start, int finish, int staging) {
        if (count == 1) {
            System.out.println("Move disk " + count +
                               " from " + start + " to " + finish);
        } else {
            move(count-1, start, staging, finish);
            System.out.println("Move disk " + count +
                               " from " + start + " to " + finish);
            move(count-1, staging, finish, start);
        }
    }

    public static void main(String[] args) {
        move(4, 1, 3, 2);
    }
}