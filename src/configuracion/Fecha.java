package configuracion;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fecha {

    private static Calendar calendar = Calendar.getInstance();
    private static String fecha;
    private Date fechaconvertida;

    public Fecha() {
    }

    public String Fecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        fecha = sdf.format(calendar.getTime());
//        fecha = calendar.getTime().toString();
        return fecha;
    }

    public Date convertirfecha(String fechaing) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            fechaconvertida = sdf.parse(fechaing);
        } catch (ParseException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fechaconvertida;

    }

    public FechaNueva calcularfechapagosemanal(FechaNueva fecnueva) {
        int dia = Integer.parseInt(fecnueva.getDia());
        int mes = Integer.parseInt(fecnueva.getMes());
        int año = Integer.parseInt(fecnueva.getAño());

        // auentamos los dias de a 7 cada vez que invocamos al metodo
        switch (mes) {
            case 1:
                dia = dia + 7;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;
            case 2:
                dia = dia + 7;
                if (dia > 28) {
                    dia = dia - 28;
                    mes++;
                }
                break;

            case 3:
                dia = dia + 7;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 4:
                dia = dia + 7;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 5:
                dia = dia + 7;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 6:
                dia = dia + 7;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 7:
                dia = dia + 7;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 8:
                dia = dia + 7;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 9:
                dia = dia + 7;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 10:
                dia = dia + 7;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 11:
                dia = dia + 7;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 12:
                dia = dia + 7;
                if (dia > 31) {
                    dia = dia - 31;
                    mes = 1;
                    año++;

                }
                break;

        }

        String diacalculado = Integer.toString(dia);
        String mescalculado = Integer.toString(mes);
        String añocalculado = Integer.toString(año);

        FechaNueva fechacalculada = new FechaNueva();

        fechacalculada.setDia(diacalculado);
        fechacalculada.setMes(mescalculado);
        fechacalculada.setAño(añocalculado);

        return fechacalculada;

        //fecha = diacalculado+"/"+mescalculado+"/"+añocalculado;
        //return fecha;
    }

    public static String FechaBD() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fecha = sdf.format(calendar.getTime());
        return fecha;
    }

    public FechaNueva calcularfechapagomensual(FechaNueva fecnueva) {

        int dia = Integer.parseInt(fecnueva.getDia());
        int mes = Integer.parseInt(fecnueva.getMes());
        int año = Integer.parseInt(fecnueva.getAño());

        // auentamos los dias de a 7 cada vez que invocamos al metodo
        switch (mes) {
            case 1:
                dia = dia + 30;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;
            case 2:
                dia = dia + 30;
                if (dia > 28) {
                    dia = dia - 28;
                    mes++;
                }
                break;

            case 3:
                dia = dia + 30;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 4:
                dia = dia + 30;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 5:
                dia = dia + 30;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 6:
                dia = dia + 30;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 7:
                dia = dia + 30;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 8:
                dia = dia + 30;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 9:
                dia = dia + 30;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 10:
                dia = dia + 30;
                if (dia > 31) {
                    dia = dia - 31;
                    mes++;
                }
                break;

            case 11:
                dia = dia + 30;
                if (dia > 30) {
                    dia = dia - 30;
                    mes++;
                }
                break;

            case 12:
                dia = dia + 30;
                if (dia > 31) {
                    dia = dia - 31;
                    mes = 1;
                    año++;

                }
                break;

        }

        String diacalculado = Integer.toString(dia);
        String mescalculado = Integer.toString(mes);
        String añocalculado = Integer.toString(año);

        FechaNueva fechacalculada = new FechaNueva();

        fechacalculada.setDia(diacalculado);
        fechacalculada.setMes(mescalculado);
        fechacalculada.setAño(añocalculado);

        return fechacalculada;

    }

}
