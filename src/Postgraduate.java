
    // класс Аспирант
    class Postgraduate extends Student {
        private String supervisor;
        private String specialtyCode;

        public Postgraduate(String name, String faculty, int admissionYear, double rating, String supervisor, String specialtyCode) {
            super(name, faculty, admissionYear, rating);
            this.supervisor = supervisor;
            this.specialtyCode = specialtyCode;
        }

        public String getSupervisor() {
            return supervisor;
        }

        public String getSpecialtyCode() {
            return specialtyCode;
        }

        @Override
        public String getInfo() {
            return super.getInfo() +
                    ", Руководитель: " + supervisor +
                    ", Код специальности: " + specialtyCode;
        }
    }
