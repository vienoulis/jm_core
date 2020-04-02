import org.omg.CORBA.INTERNAL;

import java.util.stream.IntStream;

public  class AsciiCharSequence implements CharSequence {


    byte [] sequence;
    char charSequence;

    public AsciiCharSequence(byte[] sequence) {
            this.sequence = sequence;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int index) {
        char result = 'н';
        for (int i = 0; i < sequence.length; i++) {
            if (index == i)
                return (char) sequence[i];
        }
        return result;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[end - start];
        int count = 0;
        for (int i = 0; i <sequence.length ; i++) {
            if ( i >= start  && i < end ){
                result[count] = sequence[i];
                count++;
            }
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (byte s:  sequence) {
            result.append((char) s);
        }

        return result.toString();
    }
}
