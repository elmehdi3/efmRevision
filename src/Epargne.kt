class Epargne(
    code:String,
    solde:Int, var tauxInteret:Double=6.0):Compte(code,solde) {

    override fun deposer(somme :Int){
        super.deposer(somme)
    }
    fun calculInteret(){
        solde=solde+ (solde*tauxInteret/100).toInt()
    }



}


