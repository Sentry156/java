package staticMethod.demo;

public class Test {
    public static void main(String[] args) {
        Movie[] arr = new Movie[6];
        arr[0] = new Movie(1, "盗梦空间", 20, "何塞·帕迪利亚");
        arr[1] = new Movie(2, "星际穿越", 15, "安妮·海瑟尔");
        arr[2] = new Movie(3, "钢铁侠", 30, "安妮·海瑟尔");
        arr[3] = new Movie(4, "泰坦尼克号", 39.9, "安妮·海瑟尔");
        arr[4] = new Movie(5, "八佰", 49.9, "安妮·海瑟尔");
        arr[5] = new Movie(6, "夏洛特烦恼", 18.8, "安妮·海瑟尔");
        MovieOperator mo = new MovieOperator(arr);
        mo.printAllMovies();
        mo.searchMovieById();
    }
}
