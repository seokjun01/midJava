package lang.object.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; //obj타입에는 id가 없음 따라서 캐스팅해줘야함
        return  id.equals(user.id);

    }
}
