package elegantobject.employment.dontusestaticmethod;

/**
 * "선언형 스타일 VS 명령형 스타일 (declarative vs. imperative style)"
 * 명령형 프로그래밍(imperative programming)에서는 '프로그램의 상태를 변경하는 문장(statement)을 사용해서 계산 방식을 차례대로 서술'합니다.
 * 이와 달리 선언형 프로그래밍(devlarative programming)에서는 '제어 흐름을 서술하지 않고 계산 로직을 표현'합니다.
 * 선언형 프로그래밍은 엔티티와 엔티티 사이의 관계로 구성되는 자연스러운 사고 패러다임에 더 가깝습니다.
 *
 */
class DeclarativeVsImperativeStyle {
    private interface Number {

        int intValue();
    }

    private static class Integer implements Number {

        private final int num;

        public Integer(int num) {
            this.num = num;
        }

        @Override
        public int intValue() {
            return this.num;
        }
    }
    }

    private static class Math {

        public static int max(int a, int b) {
            if (a > b) {
                return a;
            }
            return b;
        }

        public static int min(int a, int b) {
            if (a < b) {
                return a;
            }
            return b;
        }

        public static int between(int a, int b, int c) {
            return Math.min(Math.max(a, c), b);
        }
    }
}
