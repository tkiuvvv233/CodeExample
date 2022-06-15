import { createApp } from 'vue'
import App from './App.vue'

import axios from 'axios'
import VueAxios from 'vue-axios'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

let app = createApp(App)
app.config.unwrapInjectedRef = true
app.use(VueAxios, axios)
app.use(ElementPlus)
app.config.unwrapInjectedRef = true
app.mount('#app')
app.config.unwrapInjectedRef = true