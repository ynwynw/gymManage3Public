import { createRouter, createWebHashHistory } from 'vue-router'
import index from '../views'
import home from '../views/pages/home.vue'
import login from '../views/pages/login.vue'
import newsList from '@/views/pages/news/list'
import forumList from '@/views/pages/forum/list'
import yonghuList from '@/views/pages/yonghu/list'
import yonghuDetail from '@/views/pages/yonghu/formModel'
import yonghuAdd from '@/views/pages/yonghu/formAdd'
import yonghuRegister from '@/views/pages/yonghu/register'
import yonghuCenter from '@/views/pages/yonghu/center'
import jianshenzhishiList from '@/views/pages/jianshenzhishi/list'
import jianshenzhishiDetail from '@/views/pages/jianshenzhishi/formModel'
import jianshenzhishiAdd from '@/views/pages/jianshenzhishi/formAdd'
import jianshenqicaiList from '@/views/pages/jianshenqicai/list'
import jianshenqicaiDetail from '@/views/pages/jianshenqicai/formModel'
import jianshenqicaiAdd from '@/views/pages/jianshenqicai/formAdd'
import jianshenjiaolianList from '@/views/pages/jianshenjiaolian/list'
import jianshenjiaolianDetail from '@/views/pages/jianshenjiaolian/formModel'
import jianshenjiaolianAdd from '@/views/pages/jianshenjiaolian/formAdd'
import kechengleixingList from '@/views/pages/kechengleixing/list'
import kechengleixingDetail from '@/views/pages/kechengleixing/formModel'
import kechengleixingAdd from '@/views/pages/kechengleixing/formAdd'
import jianshenkechengList from '@/views/pages/jianshenkecheng/list'
import jianshenkechengDetail from '@/views/pages/jianshenkecheng/formModel'
import jianshenkechengAdd from '@/views/pages/jianshenkecheng/formAdd'
import storeupList from '@/views/pages/storeup/list'
import kechenggoumaiList from '@/views/pages/kechenggoumai/list'
import kechenggoumaiDetail from '@/views/pages/kechenggoumai/formModel'
import kechenggoumaiAdd from '@/views/pages/kechenggoumai/formAdd'

const routes = [{
		path: '/',
		redirect: '/index/home'
	},
	{
		path: '/index',
		component: index,
		children: [{
			path: 'home',
			component: home
		}
		, {
			path: 'newsList',
			component: newsList
		}
		, {
			path: 'forumList',
			component: forumList
		}
		, {
			path: 'yonghuList',
			component: yonghuList
		}, {
			path: 'yonghuDetail',
			component: yonghuDetail
		}, {
			path: 'yonghuAdd',
			component: yonghuAdd
		}
		, {
			path: 'yonghuCenter',
			component: yonghuCenter
		}
		, {
			path: 'jianshenzhishiList',
			component: jianshenzhishiList
		}, {
			path: 'jianshenzhishiDetail',
			component: jianshenzhishiDetail
		}, {
			path: 'jianshenzhishiAdd',
			component: jianshenzhishiAdd
		}
		, {
			path: 'jianshenqicaiList',
			component: jianshenqicaiList
		}, {
			path: 'jianshenqicaiDetail',
			component: jianshenqicaiDetail
		}, {
			path: 'jianshenqicaiAdd',
			component: jianshenqicaiAdd
		}
		, {
			path: 'jianshenjiaolianList',
			component: jianshenjiaolianList
		}, {
			path: 'jianshenjiaolianDetail',
			component: jianshenjiaolianDetail
		}, {
			path: 'jianshenjiaolianAdd',
			component: jianshenjiaolianAdd
		}
		, {
			path: 'kechengleixingList',
			component: kechengleixingList
		}, {
			path: 'kechengleixingDetail',
			component: kechengleixingDetail
		}, {
			path: 'kechengleixingAdd',
			component: kechengleixingAdd
		}
		, {
			path: 'jianshenkechengList',
			component: jianshenkechengList
		}, {
			path: 'jianshenkechengDetail',
			component: jianshenkechengDetail
		}, {
			path: 'jianshenkechengAdd',
			component: jianshenkechengAdd
		}
		, {
			path: 'storeupList',
			component: storeupList
		}
		, {
			path: 'kechenggoumaiList',
			component: kechenggoumaiList
		}, {
			path: 'kechenggoumaiDetail',
			component: kechenggoumaiDetail
		}, {
			path: 'kechenggoumaiAdd',
			component: kechenggoumaiAdd
		}
		]
	},
	{
		path: '/login',
		component: login
	}
	,{
		path: '/yonghuRegister',
		component: yonghuRegister
	}
]

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes
})

export default router
