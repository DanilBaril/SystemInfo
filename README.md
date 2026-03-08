# Trabalho 1 — System Info

Curso: Licenciatura em Engenharia Informática e Multimédia (LEIM)
Aluno: a51812
Data: Março 2026
URL do Repositório: https://github.com/DanilBaril/SystemInfo

---

## 1. Introdução

Este trabalho corresponde à secção 5.3 do Tutorial 1 de Desenvolvimento de
Aplicações Móveis. O objetivo é criar uma aplicação Android que apresenta
informações sobre o dispositivo atual, utilizando o objeto `android.os.Build`
para aceder às propriedades do sistema.

## 2. Visão Geral do Sistema

A aplicação apresenta num campo de texto multiline as informações do dispositivo
onde está a ser executada, incluindo fabricante, modelo, marca, versão do sistema
operativo e nível de SDK.

Funcionalidades principais:
- Leitura automática das propriedades do dispositivo no arranque
- Apresentação de 10 propriedades do sistema num campo de texto
- Interface simples e funcional

## 3. Arquitetura e Design

A aplicação segue uma arquitetura de Activity única com ConstraintLayout.
Toda a lógica está contida no MainActivity.kt. O layout contém apenas um
EditText multiline que ocupa o ecrã todo.

Estrutura de pastas:
```
app/
├── manifests/
│   └── AndroidManifest.xml
├── java/
│   └── dam_a51812/systeminfo/
│       └── MainActivity.kt
└── res/
    ├── layout/
    │   └── activity_main.xml
    └── values/
        ├── strings.xml
        └── themes.xml
```

## 4. Implementação

No `onCreate`, é construída uma string multilinha com as propriedades do
dispositivo utilizando o objeto `android.os.Build`. A string é depois atribuída
ao campo de texto `tvSystemInfo`.

Propriedades apresentadas:
- `Build.MANUFACTURER` — fabricante do dispositivo
- `Build.MODEL` — modelo do dispositivo
- `Build.BRAND` — marca do dispositivo
- `Build.TYPE` — tipo de build
- `Build.USER` — utilizador do build
- `Build.VERSION_CODES.BASE` — versão base
- `Build.VERSION.INCREMENTAL` — versão incremental
- `Build.VERSION.SDK_INT` — nível do SDK
- `Build.VERSION.RELEASE` — versão do Android
- `Build.DISPLAY` — identificador do display

## 5. Testes e Validação

Testes realizados no emulador Pixel 9 Pro AVD e em dispositivo físico:

- Todas as propriedades são apresentadas corretamente no emulador ✓
- Todas as propriedades são apresentadas corretamente no dispositivo físico ✓
- Os valores diferem entre emulador e dispositivo físico como esperado ✓

Limitações conhecidas:
- Layout não otimizado para orientação horizontal

## 6. Instruções de Utilização

Requisitos:
- Android Studio Ladybug ou superior
- Android SDK API 24 ou superior
- Kotlin 1.9 ou superior

Passos para executar:
1. Clonar o repositório: `git clone https://github.com/DanilBaril/HelloWorld`
2. Abrir o projeto no Android Studio
3. Executar num emulador ou dispositivo físico com API 24+
4. As informações do dispositivo são apresentadas automaticamente no arranque

---

# Processo de Desenvolvimento

## 12. Controlo de Versão e Histórico de Commits

O projeto foi desenvolvido em um unico commit, devido á sua simplicidade:
- Inicialização do projeto SystemInfo e implementaçao completa

## 13. Dificuldades e Lições Aprendidas

A principal dificuldade foi perceber a diferença entre `TextView` e `EditText`
para apresentar texto não editável.

Foi também interessante perceber que os valores do `android.os.Build` diferem
entre o emulador e um dispositivo físico, o que ajudou a compreender como o
Android abstrai o hardware subjacente.

## 14. Melhorias Futuras

- Substituir o EditText por um TextView para evitar edição acidental
- Adicionar mais propriedades do sistema
- Adicionar botão para copiar a informação para a área de transferência
- Melhorar o layout com secções organizadas por categoria

---

## 15. Declaração de Utilização de IA

Ferramentas de IA utilizadas: Claude (claude.ai)
Utilização: a IA foi utilizada exclusivamente como ferramenta de aprendizagem,
para esclarecer dúvidas sobre o objeto `android.os.Build` e as suas propriedades.
Nenhum código foi gerado ou copiado diretamente de ferramentas de IA.
Todo o código foi escrito pelo aluno.