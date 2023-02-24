
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //TRIANGULO, CIRCULO, RECTANGULO, CUADRADO

        boolean salida=true;
        while(salida){
            String var=JOptionPane.showInputDialog("QUE FIGURA DESEA: \n"
                    + "**CIRCULO.\n"
                    + "**RECTANGULO.\n"
                    + "**CUADRADO.\n"
                    + "**TRIANGULO.\n"
                    + "**SALIR");
            switch(var){

                case "TRIANGULO":
                    //AREA
                    double base= Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESAR LA BASE DEL TRIANGULO:"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"--INGRESA LA ALTURA DEL TRIANGULO:" ));
                    double resulArea = areaTriangulo( base,  altura);
                    JOptionPane.showMessageDialog(null, "EL AREA ES " + resulArea + "CM");
                    //PERIMETRO
                    double lado1= Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO 1 DEL TRIANGULO:"));
                    double lado2= Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO 2 DEL TRIANGULO:"));
                    double lado3= Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO 3 DEL TRIANGULO:"));
                    double resulPerimetro=perimetroTriangulo(lado1, lado2, lado3);
                    JOptionPane.showMessageDialog(null, "EL PERIMETRO ES " + resulPerimetro + "CM");
                    //TIPO TRIANGULO
                    String tipo=tipoTriangulo(lado1, lado2, lado3);
                    JOptionPane.showMessageDialog(null, "EL TIPO ES " + tipo);
                    break;
                case "CIRCULO":
                    //AREA
                    double radio=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL RADIO DEL CIRCULO: "));
                    double aCirculo=areaCirculo(radio);
                    JOptionPane.showMessageDialog(null, "**EL AREA ES: "+aCirculo+" CM");
                    //PERIMETRO
                    double per=perimetroCirculo(radio);
                    JOptionPane.showMessageDialog(null, "**EL PERIMETRO ES: "+per+" CM");
                    break;
                case "RECTANGULO":
                    //AREA
                    double baseRec=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA LA BASE DEL RECTANGULO: "));
                    double alturaRec=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA LA ALTURA DEL RECTANGULO: "));
                    double areaRec=areaRectangulo(baseRec, alturaRec);
                    JOptionPane.showMessageDialog(null, "**EL AREA ES: "+areaRec+" CM");
                    //PERIMETRO
                    double lado1Rec=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO 1 DEL RECTANGULO: "));
                    double lado2Rec=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO 2 DEL RECTANGULO: "));
                    double lado3Rec=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO 3 DEL RECTANGULO: "));
                    double lado4Rec=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO 4 DEL RECTANGULO: "));
                    double resulPerRec=perimetroRectangulo(lado1Rec, lado2Rec, lado3Rec, lado4Rec);
                    JOptionPane.showMessageDialog(null, "El PERIMETRO ES: "+resulPerRec+" CM");
                    break;
                case "CUADRADO":
                    //AREA
                    double ladoCua=Double.parseDouble(JOptionPane.showInputDialog(null, "--INGRESA EL LADO DEL CUADRADO: "));
                    double areaCua=areaCuadrado(ladoCua);
                    JOptionPane.showMessageDialog(null, "El AREA ES: "+areaCua+" CM");
                    double perCua=perimetroCuadrado(ladoCua);
                    JOptionPane.showMessageDialog(null, "El PERIMETRO ES: "+perCua+" CM");
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