package bank;

public  enum Status {

    GOOD("Very good client"){
        @Override
        public int calculateRate() {
            return 1;
        }
    },
    MIDDLE("Soso") {
        @Override
        public int calculateRate() {
            return 2;
        }
    },
    BAD("BAD for cedit") {
        @Override
        public int calculateRate() {
            return 4;
        }
    };

    private String description;

    Status(String description) {
        this.description = description;
    }

    public void getInformation(){
        System.out.println(description);
    }

    public  abstract  int calculateRate();
}
