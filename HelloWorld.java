class HelloWorld {
    private native void heavyWork(int num);

    public static void main(String[] args) {
        final int num = Integer.valueOf(args[0]);
        new HelloWorld().heavyWork(num);
    }

    static {
        System.loadLibrary("HelloWorld");
    }
}
