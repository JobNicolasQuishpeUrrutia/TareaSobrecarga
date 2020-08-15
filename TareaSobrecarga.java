package tareasobrecarga;

/**
 *
 * @author Job Nicolas Quishpe Urrutia
 */
class CantidadEmision{
    
    int PorcentajeEmision(int emision, int totalemision, int porcentaje ){
        return (emision*porcentaje)/totalemision;
    }
    double PorcentajeEmision(double emision, double totalemision, double porcentaje ){
        return (emision*porcentaje)/totalemision;
    }
    float PorcentajeEmision(float emision, float totalemision, float porcentaje ){
        return (emision*porcentaje)/totalemision;
    }
    String PorcentajeEmision(String emision, String totalemision, String porcentaje ){
        return "(emision*porcentaje)/totalemision";
    }
}

public class TareaSobrecarga {

    public static void main(String[] args) {
        
        System.out.println("                                Universidad de las Fuerzas Armadas ESPE ");
        System.out.println("                                            Sede Latacunga");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Docente: Ing. Guerra Cruz Luis Alberto");
        System.out.println("Alumno: Job Nicolas Quishpe Urrutia");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Tema: Sobrecarga\n");
        
        CantidadEmision cantidad1=new CantidadEmision();
        CantidadEmision cantidad2=new CantidadEmision();
        CantidadEmision cantidad3=new CantidadEmision();
        CantidadEmision cantidad4=new CantidadEmision();
        
        System.out.println("Cantidad de emisión del motor de combustión interna expresada en porcentaje %");
        int resultado1;
        cantidad1.PorcentajeEmision(24, 60, 100);
        resultado1=cantidad1.PorcentajeEmision(24, 60, 100);
        System.out.println("Cantidad de emisión: "+resultado1);
        
        double resultado2;
        cantidad2.PorcentajeEmision(24, 60, 100);
        resultado2=cantidad2.PorcentajeEmision(24, 60, 100);
        System.out.println(String.format("Cantidad de emisión: %.2f ",resultado2));
        
        float resultado3;
        cantidad3.PorcentajeEmision(24, 60, 100);
        resultado3=cantidad3.PorcentajeEmision(24, 60, 100);
        System.out.println("Cantidad de emisión: "+resultado3);
        
        String resultado4;
        cantidad4.PorcentajeEmision("24", "","%");
        resultado4=cantidad4.PorcentajeEmision("24", "" ,"%");
        System.out.println("Cantidad de emisión: "+resultado4);     
    }
}
