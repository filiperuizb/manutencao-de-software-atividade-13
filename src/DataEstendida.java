import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DataEstendida {
    private LocalDateTime data;

    public DataEstendida(LocalDateTime data) {
        this.data = data;
    }
    
    public String formatarData() {
        return this.data.getDayOfMonth() + "/"
                + this.data.getMonthValue() + "/"
                + this.data.getYear() + " "
                + this.data.getHour() + ":"
                + String.format("%02d", this.data.getMinute());
    }

    public Boolean isHorarioEspecial() {

        Boolean isFinalDeSemana = this.data.getDayOfWeek().equals(DayOfWeek.SATURDAY) || this.data.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        Boolean isHorarioValido = this.data.getHour() < 7 || this.data.getHour() >= 22;

        return  isFinalDeSemana ||  isHorarioValido;
    }


}
