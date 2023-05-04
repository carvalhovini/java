public class StringDNA {
    private String dnaString;

    public StringDNA(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                sb.append(c);
            }
        }
        this.dnaString = sb.toString();
    }

    public String paraString() {
        return this.dnaString;
    }

    public char caractereEm(int pos) {
        return this.dnaString.charAt(pos);
    }

    public int quantosA() {
        int count = 0;
        for (char c : this.dnaString.toCharArray()) {
            if (c == 'A') {
                count++;
            }
        }
        return count;
    }

    public int quantosC() {
        int count = 0;
        for (char c : this.dnaString.toCharArray()) {
            if (c == 'C') {
                count++;
            }
        }
        return count;
    }

    public int quantosG() {
        int count = 0;
        for (char c : this.dnaString.toCharArray()) {
            if (c == 'G') {
                count++;
            }
        }
        return count;
    }

    public int quantosT() {
        int count = 0;
        for (char c : this.dnaString.toCharArray()) {
            if (c == 'T') {
                count++;
            }
        }
        return count;
    }

    public int tamanho() {
        return this.dnaString.length();
    }

    public StringDNA reversoComplementar() {
        StringBuilder sb = new StringBuilder();
        for (int i = this.dnaString.length() - 1; i >= 0; i--) {
            char c = this.dnaString.charAt(i);
            if (c == 'A') {
                sb.append('T');
            } else if (c == 'C') {
                sb.append('G');
            } else if (c == 'G') {
                sb.append('C');
            } else if (c == 'T') {
                sb.append('A');
            }
        }
        return new StringDNA(sb.toString());
    }

    public int compara(StringDNA outro) {
        int score = 0;
        for (int i = 0; i < this.dnaString.length() && i < outro.dnaString.length(); i++) {
            char c1 = this.dnaString.charAt(i);
            char c2 = outro.dnaString.charAt(i);
            if (c1 == c2) {
                score += 3;
            } else if ((c1 == 'A' && c2 == 'T') || (c1 == 'T' && c2 == 'A') || 
                       (c1 == 'C' && c2 == 'G') || (c1 == 'G' && c2 == 'C')) {
                score += 1;
            }
        }
        return score;
    }
}