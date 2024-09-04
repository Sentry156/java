package staticMethod.demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(){};
    public MovieOperator(Movie[] arr) {
        this.movies = arr;
    }

    public void printAllMovies() {
        System.out.println("==========全部电影信息==========");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId() + " " + movies[i].getName() + " " + movies[i].getPrice() + " " + movies[i].getActor());
        }
    }

    public void searchMovieById() {
        System.out.println("请输入需要查询的电影id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for(int i=0;i<movies.length;i++){
            if(movies[i].getId() == id){
                System.out.println(movies[i].getId() + " " + movies[i].getName() + " " + movies[i].getPrice() + " " + movies[i].getActor());
                return;
            }

        }
        System.out.println("没有找到电影");
    }
}
