class strings {
    public static void main(String args[]){
        String a="praneeth";
        String b=" satya";
        String c="PRANEETH";
        String d="asdf;lkjh";
        String e="                      hi              ";
        System.out.println(a.length());
        System.out.println(a.concat(b));
        System.out.println(a.contains("satya"));
        System.out.println(a.replace('p','d'));
        System.out.println(c.toLowerCase());
        System.out.println(d.toUpperCase());
        System.out.println(e.trim());
        System.out.println(a.isEmpty());
    }
}