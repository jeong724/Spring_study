package access.b;

import access.AccessData;

public class AccessInnerMain1 {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 디폴트 호출 불가능
        //data.defaultFiled = 200;
        //data.defaultMethod();

        //프라이빗 호출 불가

        //퍼블릭 메서드인 이너엑세스 호출가능->내부에 있는 변수들 모두 출력가능
        data.innerAccess();
    }
}
