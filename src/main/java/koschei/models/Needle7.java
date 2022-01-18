package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Needle7 {
    private Set<Deth8> deth8Set;


    public Needle7(Set<Deth8> deth8Set) {
        this.deth8Set = deth8Set;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(", смерть Кощея на игле :(\n");
        for (Deth8 deth8 : deth8Set) {
            stringBuilder.append(deth8.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
