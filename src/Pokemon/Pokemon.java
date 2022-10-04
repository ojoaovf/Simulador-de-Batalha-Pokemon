package Pokemon;

import javax.swing.JOptionPane;

public class Pokemon {

        private String nome;
        private String tipo;
        private int vida;

        public Pokemon(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;

            if (null == tipo) {
                this.vida = 200;
            } else {
                switch (tipo) {
                    case "fogo":
                        this.vida = 180;
                        break;
                    case "agua":
                        this.vida = 195;
                        break;
                    case "terra":
                        this.vida = 220;
                        break;
                    case "ar":
                        this.vida = 225;
                        break;
                    default:
                        this.vida = 200;
                        break;
                }
            }
        }

        public void imprime() {
            JOptionPane.showMessageDialog(null, "O nome do pokemon é: " + nome + "\n O tipo do Pokemon é: " + tipo + "\n Vida: " + vida);
        }

        public String getNome() {
            return nome;
        }

        public String getTipo() {
            return tipo;
        }

        public int getVida() {
            return vida;
        }
        
    }
