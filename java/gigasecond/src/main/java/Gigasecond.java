import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

class Gigasecond {

     LocalDate birthDate;
    LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDate=birthDate;


        ;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime=birthDateTime;

        ;
    }

    LocalDateTime getDate() {
        if(birthDateTime==null){
            birthDateTime=LocalDateTime.of(birthDate, LocalTime.MIDNIGHT );
        }
        LocalDateTime gigasec=birthDateTime.plusSeconds(1_000_000_000);// funkcje LocalDateTime

        return gigasec;
    }

}
