package serialdevicenative;

public class SerialDeviceNative {
    enum gpio_direction_t {
        GPIO_DIR_IN,        /* Input */
        GPIO_DIR_OUT,       /* Output, initialized to low */
        GPIO_DIR_OUT_LOW,   /* Output, initialized to low */
        GPIO_DIR_OUT_HIGH,  /* Output, initialized to high */
        GPIO_DIR_PRESERVE,  /* Preserve existing direction */
    };

    public class GpioNative {
        public int Open(int pin, gpio_direction_t dir) {

            return 0;
        }

        public boolean Read() {

            return true;
        }

        public int Write(boolean val) {

            return 0;
        }

        public void Close() {

        }
    }

    public class I2cNative {
        public int Open(String dev, int addr) {
            return 0;
        }

        public int Write(byte[] buf) {
            return 0;
        }

        public void Close() {

        }
    }
}

