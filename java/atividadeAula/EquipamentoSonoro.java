class EquipamentoSonoro extends Equipamento {
    
    private boolean stereo;
    private int volume = 0;

    public EquipamentoSonoro(boolean ligado, boolean stereo, int volume) {
        super(ligado);
        this.stereo = stereo;
        this.volume = volume;
    }


    public void ligar() {
        this.ligado = true;
    }

    public void mono() {
        this.stereo = false;
    }

    public void stereo() {
        this.stereo = true;
    }

    public void aumentarVolume() {
        if (this.volume < 10) {
            this.volume +=1;
        }
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume -=1;
        }
    }

    @Override
    public String toString() {
        String stringStereo = String.valueOf(this.stereo);
        String stringVolume = String.valueOf(this.volume);
        return "Stereo: " + stringStereo + " Volume: " + stringVolume;
    }
}