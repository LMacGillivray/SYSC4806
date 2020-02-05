package temp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buddy {

    @Id
    private long id;

    private String name;
    private String phone;

    public long getId() {
      return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone (String phoneNumber) {
        this.phone = phoneNumber;
    }
}
