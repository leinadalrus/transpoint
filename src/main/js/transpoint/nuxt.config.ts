// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
    compatibilityDate: '2024-11-01',
    devtools: { enabled: true },
    app: {
        head: {
            charset: 'utf-8',
            viewport: 'width=device-width, initial-scale=1, maximum-scale=1',
            title: 'Transpoint',
            htmlAttrs: {
                lang: 'en'
            },
            link: [
                {
                    rel: 'icon',
                    type: 'image/x-icon',
                    href: '/public/favicon.ico'
                }
            ]
        }
    }
})
