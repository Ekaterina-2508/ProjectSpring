import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( configLocation: "ApplicationContext.xml");


        Furniture table = context.getBean (name: "furniture", Furniture.class);

        System.out.println(table);
        System.out.println("Название мебели: " + table.get.Name());

        context.close();



    }
}
