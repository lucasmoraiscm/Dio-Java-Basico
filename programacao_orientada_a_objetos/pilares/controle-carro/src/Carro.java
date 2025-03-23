public class Carro {
    boolean estado;
    int velocidade;
    int marcha;

    public Carro() {
        this.estado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    private void setEstado(boolean estado) {
        this.estado = estado;
    }

    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    private void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean ligar() {
        if (!this.estado) {
            this.setEstado(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean desligar() {
        if (this.estado && (this.velocidade == 0) && (this.marcha == 0)) {
            this.setEstado(false);
            return true;
        } else {
            return false;
        }
    }

    public boolean acelerar() {
        if (this.estado && (this.marcha > 0)) {
            switch (this.marcha) {
                case 1: {
                    if (this.velocidade >= 0 && this.velocidade < 20) {
                        this.velocidade += 1;
                        return true;
                    }

                    return false;
                }
                case 2: {
                    if (this.velocidade >= 21 && this.velocidade < 40) {
                        this.velocidade += 1;
                        return true;
                    }

                    return false;
                }
                case 3: {
                    if (this.velocidade >= 41 && this.velocidade < 60) {
                        this.velocidade += 1;
                        return true;
                    }

                    return false;
                }
                case 4: {
                    if (this.velocidade >= 61 && this.velocidade < 80) {
                        this.velocidade += 1;
                        return true;
                    }

                    return false;
                }
                case 5: {
                    if (this.velocidade >= 81 && this.velocidade < 100) {
                        this.velocidade += 1;
                        return true;
                    }

                    return false;
                }
                case 6: {
                    if (this.velocidade >= 101 && this.velocidade < 120) {
                        this.velocidade += 1;
                        return true;
                    }

                    return false;
                }
            }
        }

        return false;
    }

    public boolean desacelerar() {
        if (this.estado && (this.marcha > 0)) {
            switch (this.marcha) {
                case 1: {
                    if (this.velocidade > 0 && this.velocidade <= 20) {
                        this.velocidade -= 1;
                        return true;
                    }

                    return false;
                }
                case 2: {
                    if (this.velocidade > 21 && this.velocidade <= 40) {
                        this.velocidade -= 1;
                        return true;
                    }

                    return false;
                }
                case 3: {
                    if (this.velocidade > 41 && this.velocidade <= 60) {
                        this.velocidade -= 1;
                        return true;
                    }

                    return false;
                }
                case 4: {
                    if (this.velocidade > 61 && this.velocidade <= 80) {
                        this.velocidade -= 1;
                        return true;
                    }

                    return false;
                }
                case 5: {
                    if (this.velocidade > 81 && this.velocidade <= 100) {
                        this.velocidade -= 1;
                        return true;
                    }

                    return false;
                }
                case 6: {
                    if (this.velocidade > 101 && this.velocidade <= 120) {
                        this.velocidade -= 1;
                        return true;
                    }

                    return false;
                }
            }
        }

        return false;
    }

    public boolean virarEsquerda() {
        if (this.estado && (this.velocidade >= 1 && this.velocidade <= 40)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean virarDireita() {
        if (this.estado && (this.velocidade >= 1 && this.velocidade <= 40)) {
            return true;
        } else {
            return false;
        }
    }

    public int verificarVelocidade() {
        return getVelocidade();
    }

    public boolean trocarMarcha(int marcha) {
        int marchaAtual = this.getMarcha();

        if (this.estado) {
            if (marcha == marchaAtual - 1) {
                switch (marcha) {
                    case 0: {
                        if (this.velocidade == 0) {
                            this.setMarcha(marcha);
                            return true;
                        }

                        return false;
                    }
                    case 1: {
                        this.setMarcha(marcha);
                        this.setVelocidade(20);
                        return true;
                    }
                    case 2: {
                        this.setMarcha(marcha);
                        this.setVelocidade(40);
                        return true;
                    }
                    case 3: {
                        this.setMarcha(marcha);
                        this.setVelocidade(60);
                        return true;
                    }
                    case 4: {
                        this.setMarcha(marcha);
                        this.setVelocidade(80);
                        return true;
                    }
                    case 5: {
                        this.setMarcha(marcha);
                        this.setVelocidade(100);
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            } else if (marcha == marchaAtual + 1) {
                switch (marcha) {
                    case 1: {
                        this.setMarcha(marcha);
                        this.setVelocidade(0);
                        return true;
                    }
                    case 2: {
                        this.setMarcha(marcha);
                        this.setVelocidade(21);
                        return true;
                    }
                    case 3: {
                        this.setMarcha(marcha);
                        this.setVelocidade(41);
                        return true;
                    }
                    case 4: {
                        this.setMarcha(marcha);
                        this.setVelocidade(61);
                        return true;
                    }
                    case 5: {
                        this.setMarcha(marcha);
                        this.setVelocidade(81);
                        return true;
                    }
                    case 6: {
                        this.setMarcha(marcha);
                        this.setVelocidade(101);
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        return false;
    }
}
