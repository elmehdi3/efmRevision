class ComptePayant(
    code: String,
    solde:Int ):Compte(code,solde) {
    override fun deposer(somme: Int) {
        if (somme>=5){

        super.deposer(somme-5 )
        }
    }
    override fun Retirer (Somme:Int){
        if (solde>(Somme+5)){
            solde-=5
        super.Retirer(Somme )
    }}


}