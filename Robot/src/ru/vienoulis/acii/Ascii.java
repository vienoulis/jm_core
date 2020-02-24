package ru.vienoulis.acii;

import java.util.Arrays;

public class Ascii {
    public static void main(String[] args) {
        byte[] chars = "abcdefghijklmnopqrstuvwx".getBytes();
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(chars);
        System.out.println(asciiCharSequence.subSequence(2, 5));
        System.out.println(asciiCharSequence.toString());
    }

    public static class AsciiCharSequence implements CharSequence {

        byte[] sequence;

        public AsciiCharSequence(byte[] sequence) {
            this.sequence = Arrays.copyOf(sequence, sequence.length);
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
            return new AsciiCharSequence(Arrays.copyOfRange(this.sequence, start, end));
        }

        @Override
        public String toString() {
            return new String(this.sequence);
        }
    }
}