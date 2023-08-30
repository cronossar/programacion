export const API_RM = {
    URL: "https://rickandmortyapi.com/api",

    CHARACTERS : function (){
        return `${this.URL}/character`
    },
    CHARACTER_BY_ID : function (){
        return `${this.URL}/character/${id}`
    }
}