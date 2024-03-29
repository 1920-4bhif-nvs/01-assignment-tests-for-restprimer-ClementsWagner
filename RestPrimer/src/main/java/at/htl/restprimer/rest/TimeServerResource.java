package at.htl.restprimer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("time")
public class TimeServerResource {

    @GET
    public String time(){
        //return "Time: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd. MMMM YYYY hh:mm:ss"));
        return "Time: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, YYYY h:mm a"));
    }
}
