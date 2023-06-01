import entities.Saludo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Obtener el contexto de la aplicación desde el archivo beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Obtener el bean "saludoBean" del contexto
        Saludo saludo = (Saludo) context.getBean("saludoBean");

        // Ejecutar el método imprimirSaludo del bean
        saludo.imprimirSaludo();
    }
}
