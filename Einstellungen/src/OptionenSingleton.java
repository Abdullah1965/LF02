public class OptionenSingleton {
        private static OptionenSingleton instance;
        private String speicherort;
        private OptionenSingleton(){}
        public static OptionenSingleton getInstance() {
            if (instance == null){
                instance = new OptionenSingleton();
            }
            return instance;
        }
        public String getSpeicherort() {
            return speicherort;
        }
        public void setSpeicherort(String speicherort) {
            this.speicherort = speicherort;
        }
    }
