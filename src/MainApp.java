import java.util.Random;

public class MainApp {




    public static void main(String[] args) {


        for (int i = 0; i < 20; i++) {


            Random random = new Random();

            Tree<Integer> tree = new TreeImpl<>();

            int num = -20 + random.nextInt(20 -(-20));
                 tree.add(num);


                tree.display();



                System.out.println("Find 2: " + tree.find(2));
                System.out.println("Find 10: " + tree.find(10));
                System.out.println("Find -2: " + tree.find(-2));
                System.out.println("Find 666: " + tree.find(666));

                tree.remove(15);

                tree.display();

            }

        }
    }

    