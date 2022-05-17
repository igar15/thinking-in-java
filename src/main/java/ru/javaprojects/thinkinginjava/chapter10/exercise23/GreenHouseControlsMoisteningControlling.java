package ru.javaprojects.thinkinginjava.chapter10.exercise23;

public class GreenHouseControlsMoisteningControlling extends GreenHouseControls {
    private boolean moisteningSupports = false;

    public class MoisteningSupport extends Event {
        private final boolean moisteningSupports;

        public MoisteningSupport(long delayTime, boolean moisteningSupports) {
            super(delayTime);
            this.moisteningSupports = moisteningSupports;
        }

        @Override
        public void action() {
            GreenHouseControlsMoisteningControlling.this.moisteningSupports = moisteningSupports;
            System.out.println(GreenHouseControlsMoisteningControlling.this.moisteningSupports ? "Moistening support activated" : "Moistening support deactivated");
        }

        @Override
        public String toString() {
            return "Moistening activity status : " + GreenHouseControlsMoisteningControlling.this.moisteningSupports;
        }
    }
}
