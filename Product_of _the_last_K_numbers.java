class ProductOfNumbers {
    List<Integer> a = new ArrayList<>();
    public ProductOfNumbers() {}
    public void add(int num) {
        a.add(num);
    }
    public int getProduct(int k) {
        int n = a.size(),
        pro = 1;
        for (int i = n - k; i < n; i++)
            pro *= a.get(i);
        return pro;
    }
}
 //* ProductOfNumbers obj = new ProductOfNumbers();
 //* obj.add(num);
 //* int param_2 = obj.getProduct(k);
//*
