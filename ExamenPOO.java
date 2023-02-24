
package examen;

import java.util.Scanner;

public class ExamenPOO {
    public static void main(String[] args) {
        //TRIANGULO, CIRCULO, RECTANGULO, CUADRADO
        Scanner entrada = new Scanner(System.in);
        
       boolean salida=true;
       while(salida){ 
           System.out.println("********************************");
           System.out.println("QUE FIGURA DESEA: \n"
                + "**CIRCULO.\n"
                + "**RECTANGULO.\n"
                + "**CUADRADO.\n"
                + "**TRIANGULO.\n"
                + "**SALIR");
           String var=entrada.nextLine();
        switch(var){
            case "TRIANGULO":
                //AREA
                System.out.print("--INGRESAR LA BASE DEL TRIANGULO: \n");
                double base = entrada.nextDouble();
                System.out.print("--INGRESA LA ALTURA DEL TRIANGULO: \n");
                double altura = entrada.nextDouble();
                double resulArea = areaTriangulo( base,  altura);
                System.out.println("**EL AREA ES: "+resulArea);
                System.out.println("********************************");
                //PERIMETRO
                System.out.print("--INGRESA EL LADO 1 DEL TRIANGULO: \n");
                double lado1 = entrada.nextDouble();
                System.out.print("--INGRESA EL LADO 2 DEL TRIANGULO: \n");
                double lado2 = entrada.nextDouble();
                System.out.print("--INGRESA EL LADO 3 DEL TRIANGULO: \n");
                double lado3 = entrada.nextDouble();
                double resulPerimetro=perimetroTriangulo(lado1, lado2, lado3);
                System.out.println("**EL PERIMETRI ES: "+resulPerimetro);
                //TIPO TRIANGULO
                String tipo=tipoTriangulo(lado1, lado2, lado3);
                System.out.println(tipo);
                break;
            case "CIRCULO":
                //AREA
                System.out.println("--INGRESA EL RADIO DEL CIRCULO:");
                double radio=entrada.nextDouble();
                double aCirculo=areaCirculo(radio);
                System.out.println("********************************");
                System.out.println("**EL AREA ES: "+aCirculo);
                //PERIMETRO
                double per=perimetroCirculo(radio);
                System.out.println("EL PERIMETRO ES: "+per);
            break;
            case "RECTANGULO":
                //AREA
                System.out.println("--INGRESA LA BASE DEL RECTANGULO: ");
                double baseRec=entrada.nextDouble();
                System.out.println("--INGRESA LA ALTURA DEL RECTANGULO");
                double alturaRec=entrada.nextDouble();
                double areaRec=areaRectangulo(baseRec, alturaRec);
                System.out.println("EL AREA ES "+areaRec);
                System.out.println("********************************");
                //PERIMETRO
                System.out.print("--INGRESA EL LADO 1 DEL RECTANGULO: \n");
                double lado1Rec=entrada.nextDouble();
                System.out.print("--INGRESA EL LADO 2 DEL RECTANGULO: \n");
                double lado2Rec=entrada.nextDouble();
                System.out.print("--INGRESA EL LADO 3 DEL RECTANGULO: \n");
                double lado3Rec=entrada.nextDouble();
                System.out.print("--INGRESA EL LADO 4 DEL RECTANGULO: \n");
                double lado4Rec=entrada.nextDouble();
                double resulPerRec=perimetroRectangulo(lado1Rec, lado2Rec, lado3Rec, lado4Rec);
                System.out.println("EL PERIMETRO DEL RECTANGULO ES "+resulPerRec);
            break;
            case "CUADRADO":
                //AREA
                System.out.println("INGRESA UN LADO DEL CUADRADO: ");
                double ladoCua=entrada.nextDouble();
                double areaCua=areaCuadrado(ladoCua);
                System.out.println("EL AREA DEL CUADRADO ES: "+areaCua);
                System.out.println("********************************");
                double perCua=perimetroCuadrado(ladoCua);
                System.out.println("EL PERIMETRO DEL CUADRADO ES: "+perCua);
            break;  
            case "SALIR":
                salida=false;
            break;
            }
       }      
        
    }
    public static double perimetroCuadrado(double ladoCua){
        double perimetro;     
        perimetro=ladoCua*ladoCua*ladoCua*ladoCua;
        return perimetro;  
    }
    
    public static double areaCuadrado(double ladoCua){
        double area;
        area=ladoCua*ladoCua;
        return area;
    }
    public static double perimetroRectangulo(double lado1Rec, double lado2Rec, double lado3Rec, double lado4Rec){
        double perimetro;     
        perimetro=lado1Rec+lado2Rec+lado3Rec+lado4Rec;
        return perimetro;  
    }
    
    public static double areaRectangulo(double baseRec, double alturaRec){
        double area;
        area=baseRec*alturaRec;
        return area;
    }
    
    public static double perimetroCirculo(double radio){
        double perimetro;     
        perimetro=3.1416+(radio+radio);
        return perimetro;  
    }
    
    public static double areaCirculo(double radio){
        double area;
        area=3.14*(radio*radio);
        return area;
    }

    public static double areaTriangulo(double base, double altura){
        double area;     
        area=base*altura;
        return area;  
    }
    public static double perimetroTriangulo(double lado1, double lado2, double lado3){
        double perimetro;     
        perimetro=lado1 +lado2 +lado3;
        return perimetro;  
    }
    public static String tipoTriangulo(double lado1, double lado2, double lado3){
            //EQUILATERO TODOS IGUALES
            //ISOSCELES 2 IGUALES
            //ESCALENO TODOS DIF
            String triangulo;
            if(lado1 == lado2 && lado1 == lado3){
                   triangulo= "EL TRIANGULO ES ESCALENO";
            }else if(lado1 == lado2 || lado1 == lado3){
                   triangulo= "EL TRIANGULO ES ISOSCELES";
            }else{
                   triangulo= "EL TRIANGULO ES ESCALENO";
            }     
            return triangulo;
    }

    
}
