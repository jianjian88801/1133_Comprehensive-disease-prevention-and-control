import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import churujilu from '@/views/modules/churujilu/list'
    import daka from '@/views/modules/daka/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import hesuanjiance from '@/views/modules/hesuanjiance/list'
    import jiezhongjilu from '@/views/modules/jiezhongjilu/list'
    import shequyiqing from '@/views/modules/shequyiqing/list'
    import wuzi from '@/views/modules/wuzi/list'
    import wuzishenqing from '@/views/modules/wuzishenqing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryChurujilu from '@/views/modules/dictionaryChurujilu/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryJiance from '@/views/modules/dictionaryJiance/list'
    import dictionaryJiezhong from '@/views/modules/dictionaryJiezhong/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryWuzi from '@/views/modules/dictionaryWuzi/list'
    import dictionaryWuzishenqingPaifa from '@/views/modules/dictionaryWuzishenqingPaifa/list'
    import dictionaryWuzishenqingYesno from '@/views/modules/dictionaryWuzishenqingYesno/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChurujilu',
        name: '出入类型',
        component: dictionaryChurujilu
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryJiance',
        name: '检测结果',
        component: dictionaryJiance
    }
    ,{
        path: '/dictionaryJiezhong',
        name: '接种类型',
        component: dictionaryJiezhong
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryWuzi',
        name: '物资类型',
        component: dictionaryWuzi
    }
    ,{
        path: '/dictionaryWuzishenqingPaifa',
        name: '派发地点',
        component: dictionaryWuzishenqingPaifa
    }
    ,{
        path: '/dictionaryWuzishenqingYesno',
        name: '审核状态',
        component: dictionaryWuzishenqingYesno
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/churujilu',
        name: '出入记录',
        component: churujilu
      }
    ,{
        path: '/daka',
        name: '打卡',
        component: daka
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告信息',
        component: gonggao
      }
    ,{
        path: '/hesuanjiance',
        name: '核酸检测',
        component: hesuanjiance
      }
    ,{
        path: '/jiezhongjilu',
        name: '接种记录',
        component: jiezhongjilu
      }
    ,{
        path: '/shequyiqing',
        name: '社区疫情情况',
        component: shequyiqing
      }
    ,{
        path: '/wuzi',
        name: '物资',
        component: wuzi
      }
    ,{
        path: '/wuzishenqing',
        name: '物资申请',
        component: wuzishenqing
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
